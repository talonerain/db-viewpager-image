# db-viewpager-image

[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![Platform](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com/index.html)
[![API](https://img.shields.io/badge/API-21%2B-green.svg?style=flat)](https://android-arsenal.com/api?level=21)  

很多时候项目中需要实现双层Viewpager嵌套效果，但是我做过几次都是遇到各种各样的问题，这个项目使用一个Viewpager，加上计算控制显示来实现双层嵌套效果，供有需要的同学使用。  

文章地址：[https://www.jianshu.com/p/92e0eb8b3081](https://www.jianshu.com/p/92e0eb8b3081)

## 效果展示

apk下载地址：[https://github.com/talonerain/db-viewpager-image/blob/master/demo/demo-release.apk](https://github.com/talonerain/db-viewpager-image/blob/master/demo/demo-release.apk)  

<img width="300" height="450" src="https://raw.githubusercontent.com/talonerain/db-viewpager-image/master/screenshots/demo.gif"/>  


## 如何添加

### 1. 在project的gradle中添加：

```
	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
```
### 2. 在moudle的gradle中添加：

```
compile 'com.github.talonerain:db-viewpager-image:1.0.3'
```
### 3. 在xml布局文件中引入：

```
<com.lsy.view.DbVPager
        android:id="@+id/db_vpager"
        android:layout_width="match_parent"
        android:layout_height="400dp" />
```

## API说明
- setBarPosition(BarPosition position)
	- 功能说明：设置tab位置。
	- 参数定义：枚举类型BarPosition
		- BarPositon.TOP：tab位于图片之上
		- BarPosition.BOTTOM：tab位于图片之下
	- 使用示例：

		```
		db_vpager.setBarPosition(BarPosition.TOP)
		```
- setSource(List<ImgGroups> imgList)
	- 功能说明：设置待显示图片。
	- 参数定义：一个ImgGroups代表一组图片，使用方法见示例。
	- 使用示例：

		```
		List<String> imgList1 = new ArrayList<>();
      	imgList1.add(url1);
      	imgList1.add(url2);
      	ImgGroups group1 = new ImgGroups(groupName1, imgList1);
       
       List<String> imgList2 = new ArrayList<>();
       imgList2.add(url3);
       imgList2.add(url4);
       ImgGroups group2 = new ImgGroups(groupName2, imgList2);
       
       List<ImgGroups> data = new ArrayList<>();
       data.add(group1);
       data.add(group2);
       
       db_vpager.setSource(data);
		
		```
- show()
	- 功能说明：显示控件
	- 使用示例：
		
		```
		db_vpager.show();
		```
- addTabChangeListenr(DbCallbackListener listenr)
	- 功能说明：tab切换的回调
	- 参数定义：回调参数为当前tab索引及分类名。

License
-------
Copyright 2018 Siyu Liu  
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.