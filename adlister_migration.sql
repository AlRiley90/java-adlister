use adlister_db;

CREATE TABLE IF NOT EXISTS users(
                      id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                      username VARCHAR(75) NOT NULL,
                      email VARCHAR(50) NOT NULL,
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