/*
Julia asked her students to create some coding challenges. Write a query to print the hacker_id, name, and the total number of challenges created by each student. Sort your results by the total number of challenges in descending order. If more than one student created the same number of challenges, then sort the result by hacker_id. If more than one student created the same number of challenges and the count is less than the maximum number of challenges created, then exclude those students from the result.
*/

WITH countList AS (
    SELECT hacker_id,COUNT(hacker_id) as hackerSolutionCount FROM Challenges
    GROUP BY hacker_id
),
solutionCount AS (
    SELECT hackerSolutionCount, COUNT(hackerSolutionCount) as solutionCount FROM       countList
    GROUP BY hackerSolutionCount
)
SELECT Hackers.hacker_id,Hackers.name,countList.hackerSolutionCount FROM Hackers
JOIN countList ON countList.hacker_id = Hackers.hacker_id
JOIN solutionCount ON countList.hackerSolutionCount = solutionCount.hackerSolutionCount
WHERE countList.hackerSolutionCount = (SELECT MAX(hackerSolutionCount) FROM countList) OR solutionCount.solutionCount = 1
ORDER BY countList.hackerSolutionCount DESC,Hackers.hacker_id ASC