-- 코드를 입력하세요
SELECT a.PRODUCT_CODE, SUM(a.PRICE * b.SALES_AMOUNT) AS SALES
FROM PRODUCT AS a
LEFT JOIN OFFLINE_SALE AS b
ON a.PRODUCT_ID = b.PRODUCT_ID
GROUP BY a.PRODUCT_ID
ORDER BY SALES DESC, PRODUCT_CODE
