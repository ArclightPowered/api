## Arclight API

Provide a set of useful api in Arclight.

### Usage

Gradle:

```groovy
repositories {
  maven { url 'https://maven.izzel.io/releases' }
}
dependencies {
  implementation 'io.izzel.arclight:arclight-api:VERSION'
  // optionally you can include arclight common classes in srg naming
  // compileOnly 'io.izzel.arclight:arclight-forge-1.15:1.0.12:srg'
  // or using spigot mappings, or snapshot versions
  // compileOnly 'io.izzel.arclight:arclight-forge-1.15:1.0.12-SNAPSHOT:spigot'
}
```