SELECT teacher_id,COUNT(DISTINCT subject_id) AS cnt from Teacher
GROUP BY teacher_id;