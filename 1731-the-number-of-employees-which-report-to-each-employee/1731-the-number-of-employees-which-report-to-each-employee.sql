SELECT 
    E.employee_id,
    E.name,
    COUNT(F.employee_id) AS reports_count,
    ROUND(AVG(F.age), 0) AS average_age
FROM Employees E
JOIN Employees F
ON E.employee_id = F.reports_to
GROUP BY E.employee_id, E.name;
ORDER BY employee_id