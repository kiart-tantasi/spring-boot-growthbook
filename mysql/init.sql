CREATE DATABASE experiment;

-- assignments
CREATE TABLE experiment.assignment(
    user_id VARCHAR(255) NOT NULL,
    timestamp TIMESTAMP NOT NULL,
    experiment_id VARCHAR(100) NOT NULL,
    variation_id VARCHAR(100) NOT NULL
);

--INSERT INTO experiment.assignment(user_id, timestamp, experiment_id, variation_id)
--VALUES
--("1", TIMESTAMP('2024-04-01 00:00:00'), "first-exp", "a"),
--("2", TIMESTAMP('2024-04-01 00:00:00'), "first-exp", "a"),
--("3", TIMESTAMP('2024-04-01 00:00:00'), "first-exp", "a"),
--("4", TIMESTAMP('2024-04-01 00:00:00'), "first-exp", "a"),
--("5", TIMESTAMP('2024-04-01 00:00:00'), "first-exp", "a"),
--("6", TIMESTAMP('2024-04-01 00:00:00'), "first-exp", "a"),
--("7", TIMESTAMP('2024-04-01 00:00:00'), "first-exp", "a"),
--
--("8", TIMESTAMP('2024-04-01 00:00:00'), "first-exp", "b"),
--("9", TIMESTAMP('2024-04-01 00:00:00'), "first-exp", "b"),
--("10", TIMESTAMP('2024-04-01 00:00:00'), "first-exp", "b"),
--("11", TIMESTAMP('2024-04-01 00:00:00'), "first-exp", "b"),
--("12", TIMESTAMP('2024-04-01 00:00:00'), "first-exp", "b"),
--("13", TIMESTAMP('2024-04-01 00:00:00'), "first-exp", "b"),
--("14", TIMESTAMP('2024-04-01 00:00:00'), "first-exp", "b");

-- goal metrics
CREATE TABLE experiment.purchase(
    user_id VARCHAR(255) NOT NULL,
    timestamp TIMESTAMP NOT NULL
);
INSERT INTO experiment.purchase(user_id, timestamp)
VALUES ("1", TIMESTAMP('2024-04-01 01:00:00'));
