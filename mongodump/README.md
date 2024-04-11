In case you are lazy to config GrowthBook on your own, you can use `mongorestore` to restore prepared data from this `mongodump` directory

# Restore

```
mongorestore --host=localhost --port=27017 -u root -p password --authenticationDatabase=admin --db growthbook ./mongodump/dump/growthbook
```

# Dump

```
cd mongodump
mongodump --host=localhost --port=27017 -u root -p password --authenticationDatabase=admin --db growthbook
```
