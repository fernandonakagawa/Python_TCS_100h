import mysql.connector

bd = mysql.connector.connect(
  host="db4free.net",
  user="fernando_n",
  password="123456abc",
  port="3306",
  database="teste_fernando_n"
)
print(bd)
cursor = bd.cursor()

#cursor.execute("CREATE TABLE clientes (id INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(255), telefone VARCHAR(25))")
#sql = "INSERT INTO clientes (nome, telefone) VALUES (%s, %s)"
#valores = ("Arthur", "(55)99999-9999")
#cursor.execute(sql, valores)
#bd.commit()

#nome = "Fernando"
#telefone = "(43)99999-0000"
#sql = f'INSERT INTO clientes (nome, telefone) VALUES ("{nome}", "{telefone}")'
#cursor.execute(sql)
#bd.commit()

sql = f'SELECT * FROM clientes'
cursor.execute(sql)
resultado = cursor.fetchall()

for x in resultado:
  print(x)
