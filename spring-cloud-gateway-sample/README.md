
run java -jar 

localhost:8000/gtest/employee/hello   

run the eureka 8761
running an service named gwtest but gateway is routing gtest
localhost:8000/gtest/employee/hello




- id: service
  uri: lb://gwtest
  predicates:
  - Path=/gtest/**
  filters:
#            - RewritePath=/(?<path>.*), /$\{path}
            - StripPrefix=1


