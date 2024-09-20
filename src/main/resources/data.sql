-- 데이터베이스가 생성된 이후에 실행되는 코드
INSERT INTO
    "user-details" (id, name, password)
VALUES
    (101, '소크라테스', '123qwe!@#'),
    (102, '플라톤', '456rty$%^'),
    (103, '아리스토텔레스', '789uio&*(');

INSERT INTO
    "post-details" (id, content, "user_id")
VALUES
    (201, '소크라테스의 이야기 1', 101),
    (202, '소크라테스의 이야기 2', 101),
    (203, '플라톤의 이데아 이야기', 102);