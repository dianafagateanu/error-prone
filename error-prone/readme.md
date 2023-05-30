### Enable Error Prone specifc checks for patching

Update patch profile in pom.xml with the list of specific checks that will be patched:
e.g -XepPatchChecks:ArrayEquals

### Triggering Error Prone analysis

- activate maven profile: error-prone
- run: mvn clean verify
- check the logs to identify the bug patterns raised

### Patching findings resulted after error-prone analysis

- activate both maven profiles: error-prone and patch
- run: mvn clean verify
- the class files will be automatically changes with the fixes suggested
