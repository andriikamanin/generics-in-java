
---

#### **5. docs/WhyUseGenerics.md**
```markdown
# Why Use Generics?

1. **Eliminate Casting**:
   Without Generics:
   ```java
   List list = new ArrayList();
   list.add("Hello");
   String value = (String) list.get(0);
