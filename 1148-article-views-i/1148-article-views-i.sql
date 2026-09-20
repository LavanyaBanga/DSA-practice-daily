SELECT Distinct author_id AS id
FROM views
WHERE author_id=viewer_id
ORDER BY author_id asc
