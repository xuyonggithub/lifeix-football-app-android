# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.AdminApi;

public class AdminApiExample {

    public static void main(String[] args) {
        AdminApi apiInstance = new AdminApi();
        String key = "visitor"; // String | key
        try {
            List<Admin> result = apiInstance.getAdminList(key);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#getAdminList");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.c-f.com:8000/football*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**getAdminList**](docs/AdminApi.md#getAdminList) | **GET** /admin/admins | 获得Admin列表
*AdminApi* | [**loginAdmin**](docs/AdminApi.md#loginAdmin) | **POST** /admin/admins/login | Admin登录
*AdminApi* | [**registAdmin**](docs/AdminApi.md#registAdmin) | **POST** /admin/admins/regist | Admin注册
*CategoryApi* | [**addCategory**](docs/CategoryApi.md#addCategory) | **POST** /category/categories | 创建一个展示类目
*CategoryApi* | [**getCategoryList**](docs/CategoryApi.md#getCategoryList) | **GET** /category/categories | 获取整个类目
*CoachApi* | [**addCoach**](docs/CoachApi.md#addCoach) | **POST** /games/coaches | 新增教练
*CoachApi* | [**getCoach**](docs/CoachApi.md#getCoach) | **GET** /games/coaches/{coachId} | 查看教练详情
*CoachApi* | [**getCoachByTeamCategory**](docs/CoachApi.md#getCoachByTeamCategory) | **GET** /games/coaches/teamcategory/{teamCategoryId} | 查看球队分类下的所有教练
*CoachApi* | [**getNationalCoach**](docs/CoachApi.md#getNationalCoach) | **GET** /games/coaches/national | 查看国家队下的所有教练
*CompetitionApi* | [**addCompetition**](docs/CompetitionApi.md#addCompetition) | **POST** /games/competitions | 新增赛事
*CompetitionApi* | [**getCompetition**](docs/CompetitionApi.md#getCompetition) | **GET** /games/competitions/{competitionId} | 赛事所有的参赛球队信息和比赛信息（赛程）
*CompetitionCategoryApi* | [**addCompetitionCategory**](docs/CompetitionCategoryApi.md#addCompetitionCategory) | **POST** /games/competitionCategory | 新增赛事分类
*CompetitionCategoryApi* | [**getCompetitionCategories**](docs/CompetitionCategoryApi.md#getCompetitionCategories) | **GET** /games/competitionCategory | 获取赛事分类列表
*CompetitionTeamApi* | [**addCompetitionTeam**](docs/CompetitionTeamApi.md#addCompetitionTeam) | **POST** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam | 新增赛事参赛队
*CompetitionTeamApi* | [**addCompetitionTeamCoaches**](docs/CompetitionTeamApi.md#addCompetitionTeamCoaches) | **POST** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/coaches | 新增赛事参赛队教练
*CompetitionTeamApi* | [**addCompetitionTeamPlayers**](docs/CompetitionTeamApi.md#addCompetitionTeamPlayers) | **POST** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/players | 新增赛事参赛队球员
*CompetitionTeamApi* | [**addCompetitionTeamStaffs**](docs/CompetitionTeamApi.md#addCompetitionTeamStaffs) | **POST** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/staffs | 新增赛事参赛队职员
*CompetitionTeamApi* | [**getCompetitionTeam**](docs/CompetitionTeamApi.md#getCompetitionTeam) | **GET** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam | 获得参赛球队的详细信息,包括教练、球员、工作人员信息
*CompetitionTeamApi* | [**getCompetitionTeams**](docs/CompetitionTeamApi.md#getCompetitionTeams) | **GET** /games/teams/{teamId}/competitionTeam | 查询一只球队对应的赛事球队（1-n）
*CourtApi* | [**addCourt**](docs/CourtApi.md#addCourt) | **POST** /games/courts | 新增球场
*FileApi* | [**getOverwriteToken**](docs/FileApi.md#getOverwriteToken) | **GET** /file/token/overwrite | 从文件授权服务器上获取覆盖令牌
*FileApi* | [**getUploadToken**](docs/FileApi.md#getUploadToken) | **GET** /file/token/upload | 从文件授权服务器上获取上传令牌
*LikesApi* | [**addLike**](docs/LikesApi.md#addLike) | **POST** /like/likes | 对某一个目标点赞
*LikesApi* | [**getLikes**](docs/LikesApi.md#getLikes) | **GET** /like/likes | 获取喜欢列表
*LikesApi* | [**getPostLikeds**](docs/LikesApi.md#getPostLikeds) | **GET** /like/likes/{target} | 获得某一个Post的点赞信息
*MatchApi* | [**addMatch**](docs/MatchApi.md#addMatch) | **POST** /games/competitions/{competitionId}/matches | 新增比赛
*MatchApi* | [**addRelationMatchAndMatchStaff**](docs/MatchApi.md#addRelationMatchAndMatchStaff) | **POST** /games/competitions/{competitionId}/matches/{matchId}/matchstaffs | 新增比赛工作人员
*MatchApi* | [**addRelationMatchAndReferee**](docs/MatchApi.md#addRelationMatchAndReferee) | **POST** /games/competitions/{competitionId}/matches/{matchId}/referees | 新增比赛裁判
*MatchApi* | [**getByCompetitionIdAndTeamId**](docs/MatchApi.md#getByCompetitionIdAndTeamId) | **GET** /games/competitions/{competitionId}/matches | 获取赛事比赛列表,即时间轴
*MatchApi* | [**getMatch**](docs/MatchApi.md#getMatch) | **GET** /games/competitions/{competitionId}/matches/{matchId} | 获得比赛信息
*MatchStaffApi* | [**addMatchStaff**](docs/MatchStaffApi.md#addMatchStaff) | **POST** /games/matchStaffs | 新增比赛工作人员:比赛监督、赛事监督
*MatchTeamApi* | [**addMatchTeamJerseys**](docs/MatchTeamApi.md#addMatchTeamJerseys) | **POST** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/matchTeam/{matchTeamId}/jerseys | 添加参加比赛球队的球衣样式
*MatchTeamApi* | [**addMatchTeamPlayers**](docs/MatchTeamApi.md#addMatchTeamPlayers) | **POST** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/matchTeam/{matchTeamId}/players | 添加参加比赛的球员
*MatchTeamApi* | [**getMatchTeam**](docs/MatchTeamApi.md#getMatchTeam) | **GET** /games/competitions/{competitionId}/teams/{teamId}/competitionTeam/{competitionTeamId}/matchTeam/{matchTeamId} | 获得比赛球队的详细信息,包括教练、球员(首发、替补)、工作人员信息、球衣
*MenuApi* | [**addMenu**](docs/MenuApi.md#addMenu) | **POST** /category/menus/{platform} | 创建一个展示类目
*MenuApi* | [**getMenuList**](docs/MenuApi.md#getMenuList) | **GET** /category/menus/{platform} | 获取相应平台的整个菜单
*NewsApi* | [**getNewsDetail**](docs/NewsApi.md#getNewsDetail) | **GET** /news/{newsId} | 根据Id获取News详情
*NewsApi* | [**publishNews**](docs/NewsApi.md#publishNews) | **POST** /news/{newsId}/publish | 发布News到Post系统
*NewsApi* | [**searchNews**](docs/NewsApi.md#searchNews) | **GET** /news/search | 搜索News
*PlayerApi* | [**addPlayer**](docs/PlayerApi.md#addPlayer) | **POST** /games/players | 新增球员
*PlayerApi* | [**getNationalPlayer**](docs/PlayerApi.md#getNationalPlayer) | **GET** /games/players/national | 查看国家队下的所有球员
*PlayerApi* | [**getPlayer**](docs/PlayerApi.md#getPlayer) | **GET** /games/players/{playerId} | 获得球员信息
*PlayerApi* | [**getPlayerByTeamCategory**](docs/PlayerApi.md#getPlayerByTeamCategory) | **GET** /games/players/teamcategory/{teamCategoryId} | 查看球队分类下的所有球员
*QuizCategoryApi* | [**getElearningQuizCategories**](docs/QuizCategoryApi.md#getElearningQuizCategories) | **GET** /elearning/quiz_categories | 获取elearning测试类目
*QuizCategoryApi* | [**getElearningQuizPageList**](docs/QuizCategoryApi.md#getElearningQuizPageList) | **GET** /elearning/quiz_categories/{categoryId}/pages | 随机获取测试分类下的单篇列表
*RefereeApi* | [**getReferee**](docs/RefereeApi.md#getReferee) | **GET** /games/referees/{refereeId} | 获得裁判详细信息
*RefereeApi* | [**getReferees**](docs/RefereeApi.md#getReferees) | **GET** /games/referees | 获得裁判列表
*SetupDateApi* | [**getCompetitionTeamSetUpDate**](docs/SetupDateApi.md#getCompetitionTeamSetUpDate) | **GET** /games/teams/{teamId}/competitionTeam/setupDates | 查询一只球队对应的赛事球队的公布时间
*StaffApi* | [**addStaff**](docs/StaffApi.md#addStaff) | **POST** /games/staffs | 新增职员
*StaffApi* | [**getStaff**](docs/StaffApi.md#getStaff) | **GET** /games/staffs/{staffId} | 获得职员信息
*TeamApi* | [**getTeam**](docs/TeamApi.md#getTeam) | **GET** /games/teams/{teamId} | 查询一只球队
*TraingVideoApi* | [**getElearningVideoDetail**](docs/TraingVideoApi.md#getElearningVideoDetail) | **GET** /elearning/videos/{videoId} | 获取单个视频详细信息
*TrainningCategoryApi* | [**getElearningTrainingCategories**](docs/TrainningCategoryApi.md#getElearningTrainingCategories) | **GET** /elearning/training_categories | 获取elearning培训类目
*TrainningCategoryApi* | [**getElearningTrainingPageList**](docs/TrainningCategoryApi.md#getElearningTrainingPageList) | **GET** /elearning/training_categories/{categoryId}/pages | 分页获取培训分类下的单篇列表
*WemediaAuthorApi* | [**addAuthor**](docs/WemediaAuthorApi.md#addAuthor) | **POST** /wemedia/authors | 创建一个Author
*WemediaAuthorApi* | [**getAuthor**](docs/WemediaAuthorApi.md#getAuthor) | **GET** /wemedia/authors/{authorId} | 获得单个作者
*WemediaAuthorApi* | [**getAuthors**](docs/WemediaAuthorApi.md#getAuthors) | **GET** /wemedia/authors | 获得Authors列表
*WemediaPostApi* | [**addPost**](docs/WemediaPostApi.md#addPost) | **POST** /wemedia/posts | 创建一个Post
*WemediaPostApi* | [**addPostCategories**](docs/WemediaPostApi.md#addPostCategories) | **POST** /wemedia/posts/{postId}/categories | 为Post添加类目
*WemediaPostApi* | [**deletePostCategories**](docs/WemediaPostApi.md#deletePostCategories) | **DELETE** /wemedia/posts/{postId}/categories | 删除Post的分类
*WemediaPostApi* | [**deletePosts**](docs/WemediaPostApi.md#deletePosts) | **DELETE** /wemedia/posts | 删除Post
*WemediaPostApi* | [**getPostDetail**](docs/WemediaPostApi.md#getPostDetail) | **GET** /wemedia/posts/{postId} | 根据Id获取Post详情
*WemediaPostApi* | [**list**](docs/WemediaPostApi.md#list) | **GET** /wemedia/posts | 获得Posts
*WemediaPostApi* | [**search**](docs/WemediaPostApi.md#search) | **GET** /wemedia/posts/search | 搜索Post
*WemediaTimelineApi* | [**getTimelinePosts**](docs/WemediaTimelineApi.md#getTimelinePosts) | **GET** /wemedia/posts/timeline | 获取时间轴形式的Post列表
*WemediaTopApi* | [**addTopPosts**](docs/WemediaTopApi.md#addTopPosts) | **POST** /wemedia/tops | 添加Posts到对应的Category的Top
*WemediaTopApi* | [**deleteTopPosts**](docs/WemediaTopApi.md#deleteTopPosts) | **DELETE** /wemedia/tops | 从对应的Category的Top上删除Posts
*WemediaTopApi* | [**getTopPosts**](docs/WemediaTopApi.md#getTopPosts) | **GET** /wemedia/tops | 获得类目下对应的文章列表


## Documentation for Models

 - [Admin](docs/Admin.md)
 - [Author](docs/Author.md)
 - [Category](docs/Category.md)
 - [Coach](docs/Coach.md)
 - [CoachCategory](docs/CoachCategory.md)
 - [CoachCategoryTop](docs/CoachCategoryTop.md)
 - [Competition](docs/Competition.md)
 - [CompetitionCategory](docs/CompetitionCategory.md)
 - [CompetitionInfo](docs/CompetitionInfo.md)
 - [CompetitionTeam](docs/CompetitionTeam.md)
 - [CompetitionTeamInfo](docs/CompetitionTeamInfo.md)
 - [Court](docs/Court.md)
 - [ElearningOption](docs/ElearningOption.md)
 - [ElearningPage](docs/ElearningPage.md)
 - [ElearningQuizCategory](docs/ElearningQuizCategory.md)
 - [ElearningTrainingCategory](docs/ElearningTrainingCategory.md)
 - [ElearningVideo](docs/ElearningVideo.md)
 - [FrontMatch](docs/FrontMatch.md)
 - [Jerseys](docs/Jerseys.md)
 - [Like](docs/Like.md)
 - [Match](docs/Match.md)
 - [MatchInfo](docs/MatchInfo.md)
 - [MatchStaff](docs/MatchStaff.md)
 - [MatchTeam](docs/MatchTeam.md)
 - [MatchTeamInfo](docs/MatchTeamInfo.md)
 - [MatchTeamJerseys](docs/MatchTeamJerseys.md)
 - [MatchTeamPlayer](docs/MatchTeamPlayer.md)
 - [Menu](docs/Menu.md)
 - [News](docs/News.md)
 - [Player](docs/Player.md)
 - [PlayerCategory](docs/PlayerCategory.md)
 - [PlayerCategoryTop](docs/PlayerCategoryTop.md)
 - [PlayerInfo](docs/PlayerInfo.md)
 - [PlayerNationalMatch](docs/PlayerNationalMatch.md)
 - [PlayerNationalRecord](docs/PlayerNationalRecord.md)
 - [Post](docs/Post.md)
 - [Referee](docs/Referee.md)
 - [RefereeCategory](docs/RefereeCategory.md)
 - [RefereeCategoryTop](docs/RefereeCategoryTop.md)
 - [Staff](docs/Staff.md)
 - [Team](docs/Team.md)
 - [TeamCategory](docs/TeamCategory.md)
 - [TeamInfo](docs/TeamInfo.md)
 - [TimeLineNews](docs/TimeLineNews.md)
 - [UploadToken](docs/UploadToken.md)
 - [Video](docs/Video.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

chaochaog@l99.com

