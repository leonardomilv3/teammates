package teammates.ui.template;

import teammates.common.util.StringHelper;

public class StudentProfileEditBox {

    private String name;
    private String editPhoto;
    private String shortName;
    private String email;
    private String institute;
    private String nationality;
    private String gender;
    private String moreInfo;
    private String googleId;
    private String pictureUrl;

    public StudentProfileEditBox(String name, String editPhoto, String shortName, String email,
                                 String institute, String nationality, String gender,
                                 String moreInfo, String googleId, String pictureUrl) {
        this.name = name;
        this.editPhoto = editPhoto;
        this.shortName = StringHelper.convertToEmptyStringIfNull(shortName);
        this.email = StringHelper.convertToEmptyStringIfNull(email);
        this.institute = StringHelper.convertToEmptyStringIfNull(institute);
        this.nationality = StringHelper.convertToEmptyStringIfNull(nationality);
        this.gender = gender;
        this.moreInfo = StringHelper.convertToEmptyStringIfNull(moreInfo);
        this.googleId = googleId;
        this.pictureUrl = pictureUrl;
    }
    
    public String getName() {
        return name;
    }

    public String getEditPhoto() {
        return editPhoto;
    }

    public String getShortName() {
        return shortName;
    }

    public String getEmail() {
        return email;
    }

    public String getInstitute() {
        return institute;
    }

    public String getNationality() {
        return nationality;
    }

    public String getGender() {
        return gender;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public String getGoogleId() {
        return googleId;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

}
