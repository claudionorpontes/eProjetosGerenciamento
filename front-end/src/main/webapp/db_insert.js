var mysql = require('mysql');

var con = mysql.createConnection({
  host: "http://localhost:8081/front-end-0.0.1-SNAPSHOT/",
  user: "admin",
  password: "admin",
  database: "mydb"
});

con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!");
  var sql = "INSERT INTO customers (name, address) VALUES ('Company Inc', 'Highway 37')";
  con.query(sql, function (err, result) {
    if (err) throw err;
    console.log("1 record inserted");
  });
});

