init

```batch
mysql - schema name: test
u/p: root
```


```batch

curl -XPOST http://localhost:8080/api/wal


curl -XPUT http://localhost:8080/api/wal/1000 & curl -XPUT http://localhost:8080/api/wal/2000 & curl -XPUT http://localhost:8080/api/wal/3000

curl -XPUT http://localhost:8080/api/wal/1000
curl -XPUT http://localhost:8080/api/wal/2000
curl -XPUT http://localhost:8080/api/wal/3000

```