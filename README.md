# Set up project

- Run
    ```
    docker compose up
    ```

- Visit GrowthBook at http://localhost:3000 and Create Java SDK to get endpoint. Once got endpoint, Put it
  in `application*.properties` as `growthbook.endpoint=<your-endpoint>`
    - Alternatively, you can use [mongorestore](https://www.mongodb.com/try/download/database-tools) to restore
      growthbook data that I prepared
        ```
        mongorestore --host=localhost --port=27017 -u root -p password --authenticationDatabase=admin --db growthbook ./mongodump/dump/growthbook
        ```
      - e-mail and password
          ```
          test@email.com
          testtest
          ```

- Create an experiment with key `first-exp` and Link it with a feature flag as described in instructions

- Start app and you can try these endpoints
    - Allocate variant for a user and Insert an assignment row
      ```
      curl -I http://localhost:8080/api/exp/first-exp/id/{id}
      ```
    - Insert a purchase row
      ```
      curl -I -X POST http://localhost:8080/api/exp/first-exp/purchase/id/{id}
      ```
