# Intro

[JaCoCo][1]是当前最流行的测试覆盖率工具，可以帮助开发者更好地了解自己项目的质量和正确性。

执行`mvn verify`命令，然后打开`target/index.html`，即可看到测试覆盖率相关的数据，可以细致到哪一行被测到、哪一行没被测到哦😏

将`StudentServiceTest.java`中被注释掉的方法启用，然后重新运行一遍`mvn verify`，测试覆盖率提高了，你发现了吗？

[1]:https://www.eclemma.org/jacoco/