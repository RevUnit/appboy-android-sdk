package com.appboy.ui.inappmessage;

import com.appboy.models.IInAppMessage;
import com.appboy.models.MessageButton;

/**
 * The IInAppMessageManagerListener returns the in-app message at specific
 * events in its control flow and gives the host app the option of
 * overriding Appboy's default display/analytics handling and implementing its own custom behavior.
 *
 * See {@link com.appboy.ui.inappmessage.AppboyInAppMessageManager}
 */
public interface IInAppMessageManagerListener {

  /**
   * @param inAppMessage the received in-app message.
   * @return boolean flag to indicate to Appboy whether the display of this message
   * has been manually handled. If true, Appboy will do nothing with the in-app message.
   * If false, Appboy will add the message to its internal stack of in-app messages and request
   * display.
   */
  boolean onInAppMessageReceived(IInAppMessage inAppMessage);

  /**
   * @param inAppMessage the in-app message that is currently requested for display.
   * @return InAppMessageOperation indicating how to handle the candidate in-app message.
   */
  InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage inAppMessage);

  /**
   * @param inAppMessage the clicked in-app message.
   * @param inAppMessageCloser
   * @return boolean flag to indicate to Appboy whether the click has been manually handled.
   * If true, Appboy will do nothing. If false, Appboy will log a click and close the in-app message.
   */
  boolean onInAppMessageClicked(IInAppMessage inAppMessage, InAppMessageCloser inAppMessageCloser);

  /**
   * @param button the clicked message button.
   * @param inAppMessageCloser
   * @return boolean flag to indicate to Appboy whether the click has been manually handled.
   * If true, Appboy will do nothing. If false, Appboy will log a button click and close the in-app message.
   */
  boolean onInAppMessageButtonClicked(MessageButton button, InAppMessageCloser inAppMessageCloser);

  /**
   * @param inAppMessage the in-app message that was closed.
   */
  void onInAppMessageDismissed(IInAppMessage inAppMessage);
}
