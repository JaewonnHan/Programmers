-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME In ('Lucy','Ella', 'Pickle','Ronan','Sabrina','Mitty')
ORDER BY ANIMAL_ID