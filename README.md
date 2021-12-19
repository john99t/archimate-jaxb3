# ArchiMate Model Exchange Format v3.1 using JAXB v3 and Java 11

GitHub Repo: [archimate-jaxb3](https://github.com/john99t/archimate-jaxb3)

Uses the [Eclipse reference implementation of JAXB v3](https://eclipse-ee4j.github.io/jaxb-ri)

[ArchiMate Cookbook](http://www.hosiaisluoma.fi/ArchiMate-Cookbook.pdf)

To generate Java classes into /src-generated:
```bash
mvn jaxb30:generate
```

TTD:
- Generated sources should go straight into /target/generated-sources

Old ArchiMate models `ArchiMetal` and `Archinsurance` in [Archi model repo](https://github.com/archimatetool/ArchiModels)