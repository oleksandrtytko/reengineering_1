# reengineering_1
Problems / code changes:
1. humanIMB class must be moved to a separate file.
2. humanIMB class must be renamed to HumanImb.
3. HumanImb fields modifiers must be converted to private.
4. HumanImb fields must be properly named (text + camelCase) and then comments must be deleted because they become redundant in such case.
5. HumanImb fields and methods must not be static as they depend on the fields of the class.
6. HumanImb class must contain plain getters and setters, repetitive logic must be moved to a separate private method and must be called only when result is going to be retrieved, redundant imb field must be deleted.
7. HumanImb Result() must be renamed to getResult().
8. HumanImb getResult() method constants must be converted to enum.
9. HumanImb getResult() method must be formatted properly (whitespaces).
10. HumanImb enum string values must be revisited (in case it must be used as string, otherwise it must be deleted) because some of them contain trailing spaces.
11. HumanImb enum checks must not contain short-circuit evaluation (& -> &&).
12. Not related to code comments in Main class must be removed.
13. Classes must be moved to a new separate package.
14. HumanImb must be converted to a class with only static methods because it must be considered as stateless utils class. Class must be renamed to HumanImbUtils.
