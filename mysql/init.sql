CREATE DATABASE experiment;

-- assignment
CREATE TABLE experiment.assignment(
    user_id VARCHAR(255) NOT NULL,
    timestamp TIMESTAMP NOT NULL,
    experiment_id VARCHAR(100) NOT NULL,
    variation_id VARCHAR(100) NOT NULL
);

-- goal metrics
CREATE TABLE experiment.purchase(
    user_id VARCHAR(255) NOT NULL,
    timestamp TIMESTAMP NOT NULL
);
