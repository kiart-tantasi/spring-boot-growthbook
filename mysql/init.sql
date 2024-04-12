CREATE DATABASE experiment;

-- Assignment.java
CREATE TABLE experiment.assignment(
   id BIGINT NOT NULL AUTO_INCREMENT,
   user_id VARCHAR(255) NOT NULL,
   timestamp DATETIME(6) NOT NULL,
   experiment_id VARCHAR(255) NOT NULL,
   variation_id VARCHAR(255) NOT NULL,
   PRIMARY KEY (id)
);

-- Purchase.java
CREATE TABLE experiment.purchase(
   id BIGINT NOT NULL AUTO_INCREMENT,
   user_id VARCHAR(255) NOT NULL,
   timestamp DATETIME(6) NOT NULL,
   PRIMARY KEY (id)
);
