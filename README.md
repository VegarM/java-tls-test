to test:
`v=2; docker build -t "vegarm/debug:$v" . && docker push "vegarm/debug:$v" && kubectl apply -f <(sed -e "s/image:.*$/image: vegarm\/debug:$v/" app.yaml)`
