
package model;


interface State {
    void enterDetails(Context context);
    void verifyEmail(Context context);
    void verifyMobile(Context context);
    void approve(Context context);
}
