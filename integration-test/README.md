# Intro

集成测试与单元测试不同，一般会将程序完整地跑起来，测试整个系统的运行情况。

考虑到启动速度、部署便捷程度，Java项目集成测试时常常使用H2内存数据库，而非真实生产用的MySQL或PostgreSQL。

---

PS：

1. 为了简便，本示例的主程序也没有使用MySQL或PostgreSQL等生产级数据库，而是使用了轻量级的SQLite。
2. 程序附带了一个SQLite数据库`my.db`，已经存有一些数据，所以你不再需要用flyway对数据库进行创建和管理了。
3. 如果希望将前端页面和后端API一起进行测试，即端到端测试，还可以使用[Selenium][1]、[Playwright][2]等框架，自动化地模拟浏览器滚动、填写、点击之类的行为，检查结果，从而达到测试程序的目的。

[1]:https://www.selenium.dev/
[2]:https://playwright.dev/