```groovy
def myMethod(a, b) {
  if (a == null) {
    return 0
  }
  return a + b
}

def myMethodSafe(a, b) {
  a = a ?: 0 //Handle null using Elvis operator
  return a + b
}

println "Using Original myMethod (will fail with GString): "+ myMethod(null, "hello")
println "Using myMethodSafe (safe handling for null): " + myMethodSafe(null, "hello")
println "Using myMethodSafe with numbers: " + myMethodSafe(null, 5)
println "Using myMethodSafe with another null: " + myMethodSafe(null,null)
```