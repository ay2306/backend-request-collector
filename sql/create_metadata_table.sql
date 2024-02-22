CREATE TABLE upload_metadata (
    id int AUTO_INCREMENT PRIMARY KEY,
    file_name varchar(50),
    total_chunks int,
    upload_state varchar(15)
);