/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.webkit2.chromium;

import java.lang.reflect.Field;

import org.chromium2.android_webview.AwResource;

import android.content.Context;
import android.os.Build;
import android.webkit2.R;

public class ResourceProvider {
    private static boolean sInitialized;

    static void registerResources(Context context) {
        if (sInitialized) {
            return;
        }

        AwResource.setResources(context.getResources());

        // attr
//        R.attr.select_dialog_multichoice = R.attr.webviewchromium_select_dialog_multichoice;
//        R.attr.select_dialog_singlechoice = R.attr.webviewchromium_select_dialog_singlechoice;

        // color
//        org.chromium.ui.R.color.color_picker_border_color = R.color.webviewchromium_color_picker_border_color;

        // dimen

//        R.dimen.link_preview_overlay_radius = R.dimen.webviewchromium_link_preview_overlay_radius;

        // drawable
//        R.drawable.ondemand_overlay = R.drawable.webviewchromium_ondemand_overlay;
//
//        org.chromium.ui.R.drawable.color_picker_advanced_select_handle = R.drawable.webviewchromium_color_picker_advanced_select_handle;
//
//        // id
//
//        R.id.position_in_year =  R.id.webviewchromium_position_in_year;
//        R.id.year = R.id.webviewchromium_year;
//        R.id.pickers = R.id.webviewchromium_pickers;
//        R.id.date_picker =  R.id.webviewchromium_date_picker;
//        R.id.select_action_menu_select_all = R.id.webviewchromium_select_action_menu_select_all;
//        R.id.select_action_menu_cut =  R.id.webviewchromium_select_action_menu_cut;
//        R.id.select_action_menu_copy = R.id.webviewchromium_select_action_menu_copy;
//        R.id.select_action_menu_paste =
//                R.id.webviewchromium_select_action_menu_paste;
//        R.id.select_action_menu_share =
//                R.id.webviewchromium_select_action_menu_share;
//        R.id.select_action_menu_web_search =
//                R.id.webviewchromium_select_action_menu_web_search;
//        R.id.time_picker =
//                R.id.webviewchromium_time_picker;
//
//        org.chromium.ui.R.id.selected_color_view =
//                R.id.webviewchromium_color_picker_selected_color_view;
//        org.chromium.ui.R.id.title =
//                R.id.webviewchromium_color_picker_title;
//        org.chromium.ui.R.id.more_colors_button =
//                R.id.webviewchromium_color_picker_more_colors_button;
//        org.chromium.ui.R.id.color_picker_advanced =
//                R.id.webviewchromium_color_picker_advanced;
//        org.chromium.ui.R.id.color_picker_simple =
//                R.id.webviewchromium_color_picker_simple;
//        org.chromium.ui.R.id.more_colors_button_border =
//                R.id.webviewchromium_color_picker_more_colors_button_border;
//        org.chromium.ui.R.id.color_picker_simple_border =
//                R.id.webviewchromium_color_picker_simple_border;
//        org.chromium.ui.R.id.gradient =
//                R.id.webviewchromium_color_picker_gradient;
//        org.chromium.ui.R.id.text =
//                R.id.webviewchromium_color_picker_text;
//        org.chromium.ui.R.id.seek_bar =
//                R.id.webviewchromium_color_picker_seek_bar;
//        org.chromium.ui.R.id.autofill_label =
//                R.id.webviewchromium_autofill_label;
//        org.chromium.ui.R.id.autofill_popup_window =
//                R.id.webviewchromium_autofill_popup_window;
//        org.chromium.ui.R.id.autofill_sublabel =
//                R.id.webviewchromium_autofill_sublabel;
//
//        // layout
//
//        R.layout.date_time_picker_dialog =
//                R.layout.webviewchromium_date_time_picker_dialog;
//        R.layout.two_field_date_picker =
//                R.layout.webviewchromium_two_field_date_picker;
//
//        org.chromium.ui.R.layout.color_picker_dialog_title =
//                R.layout.webviewchromium_color_picker_dialog_title;
//        org.chromium.ui.R.layout.color_picker_dialog_content =
//                R.layout.webviewchromium_color_picker_dialog_content;
//        org.chromium.ui.R.layout.color_picker_advanced_component =
//                R.layout.webviewchromium_color_picker_advanced_component;
//        org.chromium.ui.R.layout.autofill_text =
//                R.layout.webviewchromium_autofill_text;
//
//        // menu
//        R.menu.select_action_menu =
//                R.menu.webviewchromium_select_action_menu;
//
//        // string
//
//        R.string.accessibility_content_view =
//                R.string.webviewchromium_accessibility_content_view;
//        R.string.accessibility_date_picker_month =
//                R.string.webviewchromium_accessibility_date_picker_month;
//        R.string.accessibility_date_picker_week =
//                R.string.webviewchromium_accessibility_date_picker_week;
//        R.string.accessibility_date_picker_year =
//                R.string.webviewchromium_accessibility_date_picker_year;
//        R.string.accessibility_datetime_picker_date =
//                R.string.webviewchromium_accessibility_datetime_picker_date;
//        R.string.accessibility_datetime_picker_time =
//                R.string.webviewchromium_accessibility_datetime_picker_time;
//        R.string.actionbar_share =
//                R.string.share;
//        R.string.actionbar_web_search =
//                R.string.websearch;
//        R.string.date_picker_dialog_clear =
//                R.string.webviewchromium_date_picker_dialog_clear;
//        R.string.date_picker_dialog_set =
//                R.string.webviewchromium_date_picker_dialog_set;
//        R.string.date_picker_dialog_title =
//                R.string.webviewchromium_date_picker_dialog_title;
//        R.string.date_time_picker_dialog_title =
//                R.string.webviewchromium_date_time_picker_dialog_title;
//        R.string.media_player_error_button =
//                R.string.webviewchromium_media_player_error_button;
//        R.string.media_player_error_text_invalid_progressive_playback =
//                R.string.webviewchromium_media_player_error_text_invalid_progressive_playback;
//        R.string.media_player_error_text_unknown =
//                R.string.webviewchromium_media_player_error_text_unknown;
//        R.string.media_player_error_title =
//                R.string.webviewchromium_media_player_error_title;
//        R.string.media_player_loading_video =
//                R.string.webviewchromium_media_player_loading_video;
//        R.string.month_picker_dialog_title =
//                R.string.webviewchromium_month_picker_dialog_title;
//        R.string.week_picker_dialog_title =
//                R.string.webviewchromium_week_picker_dialog_title;
//
//        org.chromium.ui.R.string.low_memory_error =
//                R.string.webviewchromium_low_memory_error;
//        org.chromium.ui.R.string.opening_file_error =
//                R.string.webviewchromium_opening_file_error;
//        org.chromium.ui.R.string.color_picker_button_more =
//                R.string.webviewchromium_color_picker_button_more;
//        org.chromium.ui.R.string.color_picker_hue =
//                R.string.webviewchromium_color_picker_hue;
//        org.chromium.ui.R.string.color_picker_saturation =
//                R.string.webviewchromium_color_picker_saturation;
//        org.chromium.ui.R.string.color_picker_value =
//                R.string.webviewchromium_color_picker_value;
//        org.chromium.ui.R.string.color_picker_button_set =
//                R.string.webviewchromium_color_picker_button_set;
//        org.chromium.ui.R.string.color_picker_button_cancel =
//                R.string.webviewchromium_color_picker_button_cancel;
//        org.chromium.ui.R.string.color_picker_dialog_title =
//                R.string.webviewchromium_color_picker_dialog_title;
//
//        // style
//        R.style.SelectPopupDialog =
//                R.style.webviewchromium_SelectPopupDialog;
//        org.chromium.ui.R.style.AutofillPopupWindow =
//                R.style.webviewchromium_AutofillPopupWindow;

        if (Build.IS_DEBUGGABLE) {
            // Ensure that we aren't missing any resource mappings.
            verifyFields(R.class);
            verifyFields(R.class);
        }

        // Resources needed by android_webview/

//        AwResource.RAW_LOAD_ERROR = R.raw.loaderror;
//        AwResource.RAW_NO_DOMAIN = R.raw.nodomain;
//
//        AwResource.STRING_DEFAULT_TEXT_ENCODING = R.string.default_text_encoding;

        sInitialized = true;
    }

    // Verify that all the fields of the inner classes of |R| have a valid mapping.
    // This ensures that if a resource is added upstream, we won't miss providing
    // a mapping downstream.
    private static void verifyFields(Class<?> R) {
        for (Class<?> c : R.getDeclaredClasses()) {
            verifyFields(c);  // recursively check inner classes.
        }

        for (Field f : R.getDeclaredFields()) {
            try {
                if (f.getInt(null) == 0) {
                    throw new RuntimeException("Missing resource mapping for " +
                            R.getName() + "." + f.getName());
                }
            } catch (IllegalAccessException e) { }
        }
    }
}
