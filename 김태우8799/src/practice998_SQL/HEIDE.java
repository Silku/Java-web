package practice998_SQL;

public class HEIDE {

	/*��ȸ(select) */
	SELECT
		*
	FROM
		employees;

	/*����(UPDATE)*/	
	UPDATE
		empoyees
	SET
		extension = 'x103',
		officecode = '5',
	WHERE
		employeesnumber = '1800';	

	/*
	WHERE
		lastname = 'Gerard' 
	AND firstname =  'Martin';
	*/
	/*�߰�(INSERT) */
	/*
	INSERT INTO
		employees
	(
		employeeNumber,
		lastname,
		firstname,
		extension,
		email,
		officecode,
		reportsto,
		jobtitle
	)
	VALUES
	(
		'1800',
		'kim',
		'junil',
		'x101',
		'kimjunil@gmail.com',
		'4',
		'1102',
		'sales rep'
	)
	*/



	/*SELECT 
		*
	FROM 
		orderdetails AS ot
		INNER JOIN orders AS o ON(ot.orderNumber = o.orderNumber);
	*/
	/*
	/*����(delete)DELETE
	FROM 
		ORDERS
	WHERE
		ORDERNUMBER = '10102';
		*/
	/*	LEFT OUTER JOIN orders AS o ON(ot.orderNumber = o.orderNumber) */
	/*WHERE 

		ot.productCode = 'S18_1749'
	AND
		ot.orderNumber = '10100'
	*/
	/*
		ORDERNumber > '10150' 
	AND orderNumber < '10160';
	*/
}
**/