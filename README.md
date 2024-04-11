# Set up project

- Run
    ```
    docker compose up
    ```

- Then visit GrowthBOok at http://localhost:3000 and Create Java SDK to get endpoint

- Once got endpoint, Put it in `application*.properties` as `growthbook.endpoint=<your-endpoint>`

- Start app and you can try these endpoints
    - Allocate variant for a user
      ```
      curl -I http://localhost:8080/api/exp/first-exp/id/{id}
      ```
    - Insert a purchase row
      ```
      curl -I -X POST http://localhost:8080/api/exp/first-exp/purchase/id/{id}
      ```
