# Set up project

- Run
    ```
    docker compose up
    ```

- Set up GrowthBook
    - Visit GrowthBook at http://localhost:3000 and Create Java SDK to get endpoint. Once got endpoint, Put
      in `application.properties` as `growthbook.endpoint=<your-endpoint>`
    - Create an experiment with key `first-exp` (or whatever key you prefer) and Link it with a feature flag as
      described in GrowthBook's instructions
    - Alternatively from steps above, you can use [mongorestore](https://www.mongodb.com/try/download/database-tools) to
      restore growthbook data that I prepared
        ```
        mongorestore --host=localhost --port=27017 -u root -p password --authenticationDatabase=admin --db growthbook ./mongodump/dump/growthbook
        ```
        - e-mail and password
            ```
            test@email.com
            testtest
            ```

- Start app and you can try these endpoints
    - Allocate variant for a user which will also insert an assignment row
      ```
      curl -I http://localhost:8080/api/exp/first-exp/id/{id}
      ```
    - Insert a purchase row for goal metrics
      ```
      curl -I -X POST http://localhost:8080/api/exp/events/purchase/id/{id}
      ```

# Todo

- Find java type that suits MySQL's DATETIME and TIMESTAMP type (Instant, LocalDateTime, ZonedDateTime, ...)
