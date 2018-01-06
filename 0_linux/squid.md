# Install Squid proxy server on Ubuntu 14.04

## Installing Squid
Squid is available in the Ubuntu repositories. To ensure your system is up to date and then to install Squid, run the following commands:
```
sudo apt-get update
sudo apt-get upgrade
sudo apt-get install squid
```
Copy the original configuration file to keep as a backup:
```
sudo cp /etc/squid/squid.conf /etc/squid/squid.conf.default
```

The first thing you may like to change is the Squid listening port. By default, Squid is listening on port `3128`. To change the default listening port you need to edit the http_port directive. For example, if you like to set `8888` as Squid listening port, you should edit the directive to look like the directive below:
```
http_port 8888
```

To restart Squid you can use the following command:
```
sudo /etc/init.d/squid restart
```

## Authentication
You will need the htpasswd utility. If you’ve installed Apache on your Linode, you will already have it. Otherwise run:
```
sudo apt-get install apache2-utils
```
**Create your own user and password:**
```
sudo htpasswd -c -d /etc/squid/passwords any_username_you_want
sudo chmod o+r /etc/squid/passwords
```

to add more users:
```
sudo htpasswd -d /etc/squid/passwords other_username_you_want
```

>**WARNING:** At this point be careful your password should be 8 digits long otherwise it will use the first 8 digits off your password. You can use something shorter.


**[IMPORTANT]** Find `INSERT YOUR OWN RULE(S) HERE TO ALLOW ACCESS FROM YOUR CLIENTS` in the conf file and add the following lines just after it

I use Vim to edit config:
```
sudo vim /etc/squid/squid.conf
```

and add those lines to `squid.conf`:
```
acl allcomputers src 0.0.0.0/0.0.0.0
auth_param basic program /usr/lib/squid/basic_ncsa_auth /etc/squid/passwords
auth_param basic realm proxy
acl authenticated proxy_auth REQUIRED
http_access allow authenticated allcomputers
```

**Like this:**
```
#
# INSERT YOUR OWN RULE(S) HERE TO ALLOW ACCESS FROM YOUR CLIENTS
#

acl allcomputers src 0.0.0.0/0.0.0.0
auth_param basic program /usr/lib/squid/basic_ncsa_auth /etc/squid/passwords
auth_param basic realm proxy
acl authenticated proxy_auth REQUIRED
http_access allow authenticated allcomputers
```

Don't forget restarting Squid with command:
```
sudo /etc/init.d/squid restart
```

To check access logs: 
```
sudo tail -f /var/log/squid/access.log
```

Enjoy! :D 
