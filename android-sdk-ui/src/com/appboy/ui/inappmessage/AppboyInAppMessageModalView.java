package com.appboy.ui.inappmessage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.appboy.ui.R;

import java.util.ArrayList;
import java.util.List;

public class AppboyInAppMessageModalView extends AppboyInAppMessageImmersiveBaseView {

  public AppboyInAppMessageModalView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override
  public void setMessageBackgroundColor(int color) {
    InAppMessageViewUtils.setViewBackgroundColorFilter(findViewById(R.id.com_appboy_inappmessage_modal),
        color, getContext().getResources().getColor(R.color.com_appboy_inappmessage_background_light));
  }

  @Override
  public List<View> getMessageButtonViews() {
    List<View> buttonViews = new ArrayList<View>();
    if (findViewById(R.id.com_appboy_inappmessage_modal_button_one) != null) {
      buttonViews.add(findViewById(R.id.com_appboy_inappmessage_modal_button_one));
    }
    if (findViewById(R.id.com_appboy_inappmessage_modal_button_two) != null) {
      buttonViews.add(findViewById(R.id.com_appboy_inappmessage_modal_button_two));
    }
    return buttonViews;
  }

  @Override
  public View getMessageButtonsView() {
    return findViewById(R.id.com_appboy_inappmessage_modal_button_layout);
  }

  @Override
  public TextView getMessageTextView() {
    return (TextView) findViewById(R.id.com_appboy_inappmessage_modal_message);
  }

  @Override
  public TextView getMessageHeaderTextView() {
    return (TextView) findViewById(R.id.com_appboy_inappmessage_modal_header_text);
  }

  @Override
  public View getMessageClickableView() {
    return findViewById(R.id.com_appboy_inappmessage_modal);
  }

  @Override
  public View getMessageCloseButtonView() {
    return findViewById(R.id.com_appboy_inappmessage_modal_close_button);
  }

  @Override
  public ImageView getMessageImageView() {
    return (ImageView) findViewById(R.id.com_appboy_inappmessage_modal_image);
  }

  @Override
  public TextView getMessageIconView() {
    return (TextView) findViewById(R.id.com_appboy_inappmessage_modal_icon);
  }

  @Override
  public Drawable getMessageBackgroundObject() {
    return findViewById(R.id.com_appboy_inappmessage_modal).getBackground();
  }
}
