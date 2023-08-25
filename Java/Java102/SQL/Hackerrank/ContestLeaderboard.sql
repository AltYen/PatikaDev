/*
You did such a great job helping Julia with her last coding contest challenge that she wants you to work on this one, too!

The total score of a hacker is the sum of their maximum scores for all of the challenges. Write a query to print the hacker_id, name, and total score of the hackers ordered by the descending score. If more than one hacker achieved the same total score, then sort the result by ascending hacker_id. Exclude all hackers with a total score of () from your result.
*/

SELECT Hackers.hacker_id, Hackers.name, SUM(Submissions.max_score) FROM Hackers
JOIN (
    SELECT hacker_id,challenge_id, MAX(score) AS max_score FROM Submissions
    GROUP BY hacker_id,challenge_id
    ORDER BY challenge_id
) AS Submissions
ON Hackers.hacker_id = Submissions.hacker_id
GROUP BY Hackers.hacker_id, Hackers.name
HAVING SUM(Submissions.max_score) > 0
ORDER BY SUM(Submissions.max_score) DESC, Hackers.hacker_id;


SELECT Hackers.hacker_id, Hackers.name, SUM(Challenges.count) FROM Hackers
JOIN
(
    SELECT challenge_id,hacker_id,COUNT(*) AS count FROM Challenges
    GROUP BY challenge_id,hacker_id
) AS Challenges ON Challenges.hacker_id = Hackers.hacker_id
GROUP BY Hackers.hacker_id, Hackers.name
ORDER BY SUM(Challenges.count) DESC,Hackers.hacker_id ASC


SELECT Hackers.hacker_id, Hackers.name, SUM(Challenges.count) FROM Hackers
JOIN
(
    SELECT challenge_id,hacker_id,COUNT(*) AS count FROM Challenges
    GROUP BY challenge_id,hacker_id
) AS Challenges ON Challenges.hacker_id = Hackers.hacker_id
GROUP BY Hackers.hacker_id, Hackers.name
HAVING SUM(Challenges.count) = (SELECT MAX(count) FROM (
    SELECT COUNT(hacker_id) AS count FROM Challenges
    GROUP BY hacker_id
) as alt)
ORDER BY SUM(Challenges.count) DESC,Hackers.hacker_id ASC


SELECT MAX(count) FROM (
    SELECT COUNT(hacker_id) AS count FROM Challenges
    GROUP BY hacker_id
)as alt

SELECT hacker_id,COUNT(hacker_id) FROM Challenges
GROUP BY hacker_id
HAVING COUNT(hacker_id) <> (SELECT MAX(count) FROM (
    SELECT COUNT(hacker_id) AS count FROM Challenges
    GROUP BY hacker_id
)as alt)