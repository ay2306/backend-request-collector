CREATE TABLE upload_metadata (
    id int NOT NULL AUTO_INCREMENT,
    file_name varchar(50),
    total_chunks int,
    upload_state varchar(15),
    PRIMARY KEY(id)
);