In case you are lazy to config GrowthBook on your own, you can use `mongorestore` to restore prepared data from this `mongodump` directory

# Fist, Install MongoDB Command Line Database Tools Download

Please follow https://www.mongodb.com/try/download/database-tools

# mongorestore

```
mongorestore --host=localhost --port=27017 -u root -p password --authenticationDatabase=admin --db growthbook ./mongodump/dump/growthbook
```

# e-mail and password

```
test@test.com
testtest
```

# mongodump (for backing-up)

```
cd mongodump
mongodump --host=localhost --port=27017 -u root -p password --authenticationDatabase=admin --db growthbook
```
