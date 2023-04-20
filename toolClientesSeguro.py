import MySQLdb

db = MySQLdb.connect(
    host="128.426.21.1",
    user="AlexisM",
    passwd="AlexisM",
    db="toolsql-Clientes-Seguro"
)

cursor = db.cursor()

numCus = input("Introduce el nombre del cliente: ")
email = input("Introduce el email del cliente: ")
tipo = input("Introduce el tipo de póliza: ")
suma = input("Introduce la suma asegurada del cliente: ")
fecha = input("Introduce la fecha de inicio de la póliza: ")

sql = "INSERT INTO clientes (numCus, email, tipo, suma, fecha) VALUES (%s, %s, %s, %s, %s)"
val = (numCus, email, tipo, suma, fecha)
cursor.execute(sql, val)

db.commit()

db.close()

print("Los parámetros se han insertado correctamente en la base de datos.")

print("test")
