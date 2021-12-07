use adlister_db;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS ads;

CREATE TABLE IF NOT EXISTS users(
                      id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                      username VARCHAR(75) NOT NULL,
                      email VARCHAR(50) NOT NULL,
                      password VARCHAR(50) NOT NULL,
                      PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS ads(
                    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                    user_id INT UNSIGNED NOT NULL,
                    title VARCHAR(100),
                    description VARCHAR(300),
                    PRIMARY KEY (id),
                    FOREIGN KEY (user_id) REFERENCES users (id)
);