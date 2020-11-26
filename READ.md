## 基于yaml文件执行自动化

### yaml文件格式

- data 存放sendKeys的数据
- step 存放web自动化的步骤

具体的数据如下：
```yaml
# sendKyes的测试数据
data:
  - aa
  - bb
  - cc

# 执行步骤
steps:
  # 浏览器名称
  browser: chrome
  # 隐式等待时间
  implicitlyWait: 5
  # 页面的url
  url: https://ceshiren.com
  # 元素的对象及动作
  elements:
    # 定位方式，有id，css，xpath
    - id: search-button
      # 动作
      action: click
    - id: search-term
      # sendKeys后面要加个整数表示第几个参数，与data里面的数据相对应
      action: sendkeys, 1
  # 关闭浏览器
  close: true
```
