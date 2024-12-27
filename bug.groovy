```groovy
def myMethod(a, b) {
  if (a == null) {
    return 0  // This will cause a NullPointerException if b is a GString
  }
  return a + b
}

println myMethod(null, "hello")
```