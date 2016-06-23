package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Admin".equalsIgnoreCase(className)) {
      return new TypeToken<List<Admin>>(){}.getType();
    }
    
    if ("Author".equalsIgnoreCase(className)) {
      return new TypeToken<List<Author>>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<List<Category>>(){}.getType();
    }
    
    if ("Coach".equalsIgnoreCase(className)) {
      return new TypeToken<List<Coach>>(){}.getType();
    }
    
    if ("CoachCategory".equalsIgnoreCase(className)) {
      return new TypeToken<List<CoachCategory>>(){}.getType();
    }
    
    if ("CoachCategoryTop".equalsIgnoreCase(className)) {
      return new TypeToken<List<CoachCategoryTop>>(){}.getType();
    }
    
    if ("Competition".equalsIgnoreCase(className)) {
      return new TypeToken<List<Competition>>(){}.getType();
    }
    
    if ("CompetitionCategory".equalsIgnoreCase(className)) {
      return new TypeToken<List<CompetitionCategory>>(){}.getType();
    }
    
    if ("CompetitionInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<CompetitionInfo>>(){}.getType();
    }
    
    if ("CompetitionTeam".equalsIgnoreCase(className)) {
      return new TypeToken<List<CompetitionTeam>>(){}.getType();
    }
    
    if ("CompetitionTeamInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<CompetitionTeamInfo>>(){}.getType();
    }
    
    if ("Court".equalsIgnoreCase(className)) {
      return new TypeToken<List<Court>>(){}.getType();
    }
    
    if ("ElearningOption".equalsIgnoreCase(className)) {
      return new TypeToken<List<ElearningOption>>(){}.getType();
    }
    
    if ("ElearningPage".equalsIgnoreCase(className)) {
      return new TypeToken<List<ElearningPage>>(){}.getType();
    }
    
    if ("ElearningQuizCategory".equalsIgnoreCase(className)) {
      return new TypeToken<List<ElearningQuizCategory>>(){}.getType();
    }
    
    if ("ElearningTrainingCategory".equalsIgnoreCase(className)) {
      return new TypeToken<List<ElearningTrainingCategory>>(){}.getType();
    }
    
    if ("ElearningVideo".equalsIgnoreCase(className)) {
      return new TypeToken<List<ElearningVideo>>(){}.getType();
    }
    
    if ("FrontMatch".equalsIgnoreCase(className)) {
      return new TypeToken<List<FrontMatch>>(){}.getType();
    }
    
    if ("Jerseys".equalsIgnoreCase(className)) {
      return new TypeToken<List<Jerseys>>(){}.getType();
    }
    
    if ("Like".equalsIgnoreCase(className)) {
      return new TypeToken<List<Like>>(){}.getType();
    }
    
    if ("Match".equalsIgnoreCase(className)) {
      return new TypeToken<List<Match>>(){}.getType();
    }
    
    if ("MatchInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<MatchInfo>>(){}.getType();
    }
    
    if ("MatchStaff".equalsIgnoreCase(className)) {
      return new TypeToken<List<MatchStaff>>(){}.getType();
    }
    
    if ("MatchTeam".equalsIgnoreCase(className)) {
      return new TypeToken<List<MatchTeam>>(){}.getType();
    }
    
    if ("MatchTeamInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<MatchTeamInfo>>(){}.getType();
    }
    
    if ("MatchTeamJerseys".equalsIgnoreCase(className)) {
      return new TypeToken<List<MatchTeamJerseys>>(){}.getType();
    }
    
    if ("MatchTeamPlayer".equalsIgnoreCase(className)) {
      return new TypeToken<List<MatchTeamPlayer>>(){}.getType();
    }
    
    if ("Menu".equalsIgnoreCase(className)) {
      return new TypeToken<List<Menu>>(){}.getType();
    }
    
    if ("News".equalsIgnoreCase(className)) {
      return new TypeToken<List<News>>(){}.getType();
    }
    
    if ("Player".equalsIgnoreCase(className)) {
      return new TypeToken<List<Player>>(){}.getType();
    }
    
    if ("PlayerCategory".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlayerCategory>>(){}.getType();
    }
    
    if ("PlayerCategoryTop".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlayerCategoryTop>>(){}.getType();
    }
    
    if ("PlayerInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlayerInfo>>(){}.getType();
    }
    
    if ("PlayerNationalMatch".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlayerNationalMatch>>(){}.getType();
    }
    
    if ("PlayerNationalRecord".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlayerNationalRecord>>(){}.getType();
    }
    
    if ("Post".equalsIgnoreCase(className)) {
      return new TypeToken<List<Post>>(){}.getType();
    }
    
    if ("Referee".equalsIgnoreCase(className)) {
      return new TypeToken<List<Referee>>(){}.getType();
    }
    
    if ("RefereeCategory".equalsIgnoreCase(className)) {
      return new TypeToken<List<RefereeCategory>>(){}.getType();
    }
    
    if ("RefereeCategoryTop".equalsIgnoreCase(className)) {
      return new TypeToken<List<RefereeCategoryTop>>(){}.getType();
    }
    
    if ("Staff".equalsIgnoreCase(className)) {
      return new TypeToken<List<Staff>>(){}.getType();
    }
    
    if ("Team".equalsIgnoreCase(className)) {
      return new TypeToken<List<Team>>(){}.getType();
    }
    
    if ("TeamCategory".equalsIgnoreCase(className)) {
      return new TypeToken<List<TeamCategory>>(){}.getType();
    }
    
    if ("TeamInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<TeamInfo>>(){}.getType();
    }
    
    if ("TimeLineNews".equalsIgnoreCase(className)) {
      return new TypeToken<List<TimeLineNews>>(){}.getType();
    }
    
    if ("UploadToken".equalsIgnoreCase(className)) {
      return new TypeToken<List<UploadToken>>(){}.getType();
    }
    
    if ("Video".equalsIgnoreCase(className)) {
      return new TypeToken<List<Video>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Admin".equalsIgnoreCase(className)) {
      return new TypeToken<Admin>(){}.getType();
    }
    
    if ("Author".equalsIgnoreCase(className)) {
      return new TypeToken<Author>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<Category>(){}.getType();
    }
    
    if ("Coach".equalsIgnoreCase(className)) {
      return new TypeToken<Coach>(){}.getType();
    }
    
    if ("CoachCategory".equalsIgnoreCase(className)) {
      return new TypeToken<CoachCategory>(){}.getType();
    }
    
    if ("CoachCategoryTop".equalsIgnoreCase(className)) {
      return new TypeToken<CoachCategoryTop>(){}.getType();
    }
    
    if ("Competition".equalsIgnoreCase(className)) {
      return new TypeToken<Competition>(){}.getType();
    }
    
    if ("CompetitionCategory".equalsIgnoreCase(className)) {
      return new TypeToken<CompetitionCategory>(){}.getType();
    }
    
    if ("CompetitionInfo".equalsIgnoreCase(className)) {
      return new TypeToken<CompetitionInfo>(){}.getType();
    }
    
    if ("CompetitionTeam".equalsIgnoreCase(className)) {
      return new TypeToken<CompetitionTeam>(){}.getType();
    }
    
    if ("CompetitionTeamInfo".equalsIgnoreCase(className)) {
      return new TypeToken<CompetitionTeamInfo>(){}.getType();
    }
    
    if ("Court".equalsIgnoreCase(className)) {
      return new TypeToken<Court>(){}.getType();
    }
    
    if ("ElearningOption".equalsIgnoreCase(className)) {
      return new TypeToken<ElearningOption>(){}.getType();
    }
    
    if ("ElearningPage".equalsIgnoreCase(className)) {
      return new TypeToken<ElearningPage>(){}.getType();
    }
    
    if ("ElearningQuizCategory".equalsIgnoreCase(className)) {
      return new TypeToken<ElearningQuizCategory>(){}.getType();
    }
    
    if ("ElearningTrainingCategory".equalsIgnoreCase(className)) {
      return new TypeToken<ElearningTrainingCategory>(){}.getType();
    }
    
    if ("ElearningVideo".equalsIgnoreCase(className)) {
      return new TypeToken<ElearningVideo>(){}.getType();
    }
    
    if ("FrontMatch".equalsIgnoreCase(className)) {
      return new TypeToken<FrontMatch>(){}.getType();
    }
    
    if ("Jerseys".equalsIgnoreCase(className)) {
      return new TypeToken<Jerseys>(){}.getType();
    }
    
    if ("Like".equalsIgnoreCase(className)) {
      return new TypeToken<Like>(){}.getType();
    }
    
    if ("Match".equalsIgnoreCase(className)) {
      return new TypeToken<Match>(){}.getType();
    }
    
    if ("MatchInfo".equalsIgnoreCase(className)) {
      return new TypeToken<MatchInfo>(){}.getType();
    }
    
    if ("MatchStaff".equalsIgnoreCase(className)) {
      return new TypeToken<MatchStaff>(){}.getType();
    }
    
    if ("MatchTeam".equalsIgnoreCase(className)) {
      return new TypeToken<MatchTeam>(){}.getType();
    }
    
    if ("MatchTeamInfo".equalsIgnoreCase(className)) {
      return new TypeToken<MatchTeamInfo>(){}.getType();
    }
    
    if ("MatchTeamJerseys".equalsIgnoreCase(className)) {
      return new TypeToken<MatchTeamJerseys>(){}.getType();
    }
    
    if ("MatchTeamPlayer".equalsIgnoreCase(className)) {
      return new TypeToken<MatchTeamPlayer>(){}.getType();
    }
    
    if ("Menu".equalsIgnoreCase(className)) {
      return new TypeToken<Menu>(){}.getType();
    }
    
    if ("News".equalsIgnoreCase(className)) {
      return new TypeToken<News>(){}.getType();
    }
    
    if ("Player".equalsIgnoreCase(className)) {
      return new TypeToken<Player>(){}.getType();
    }
    
    if ("PlayerCategory".equalsIgnoreCase(className)) {
      return new TypeToken<PlayerCategory>(){}.getType();
    }
    
    if ("PlayerCategoryTop".equalsIgnoreCase(className)) {
      return new TypeToken<PlayerCategoryTop>(){}.getType();
    }
    
    if ("PlayerInfo".equalsIgnoreCase(className)) {
      return new TypeToken<PlayerInfo>(){}.getType();
    }
    
    if ("PlayerNationalMatch".equalsIgnoreCase(className)) {
      return new TypeToken<PlayerNationalMatch>(){}.getType();
    }
    
    if ("PlayerNationalRecord".equalsIgnoreCase(className)) {
      return new TypeToken<PlayerNationalRecord>(){}.getType();
    }
    
    if ("Post".equalsIgnoreCase(className)) {
      return new TypeToken<Post>(){}.getType();
    }
    
    if ("Referee".equalsIgnoreCase(className)) {
      return new TypeToken<Referee>(){}.getType();
    }
    
    if ("RefereeCategory".equalsIgnoreCase(className)) {
      return new TypeToken<RefereeCategory>(){}.getType();
    }
    
    if ("RefereeCategoryTop".equalsIgnoreCase(className)) {
      return new TypeToken<RefereeCategoryTop>(){}.getType();
    }
    
    if ("Staff".equalsIgnoreCase(className)) {
      return new TypeToken<Staff>(){}.getType();
    }
    
    if ("Team".equalsIgnoreCase(className)) {
      return new TypeToken<Team>(){}.getType();
    }
    
    if ("TeamCategory".equalsIgnoreCase(className)) {
      return new TypeToken<TeamCategory>(){}.getType();
    }
    
    if ("TeamInfo".equalsIgnoreCase(className)) {
      return new TypeToken<TeamInfo>(){}.getType();
    }
    
    if ("TimeLineNews".equalsIgnoreCase(className)) {
      return new TypeToken<TimeLineNews>(){}.getType();
    }
    
    if ("UploadToken".equalsIgnoreCase(className)) {
      return new TypeToken<UploadToken>(){}.getType();
    }
    
    if ("Video".equalsIgnoreCase(className)) {
      return new TypeToken<Video>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
