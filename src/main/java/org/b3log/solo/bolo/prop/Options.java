package org.b3log.solo.bolo.prop;

import org.b3log.latke.model.User;
import org.b3log.solo.SoloServletListener;
import org.b3log.solo.model.Option;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h3>bolo-solo</h3>
 * <p>选项的集合，包括初始化和设置更新都从这里设置</p>
 *
 * @author : https://github.com/adlered
 * @date : 2020-05-24
 **/
public class Options {
    public static List<String> loadOptions() {
        List<String> optionList = new ArrayList<>();
        Collections.addAll(optionList,
                // Solo 字段
                Option.ID_C_CUSTOM_VARS,
                Option.ID_C_HLJS_THEME,
                Option.ID_C_PULL_GITHUB,
                Option.ID_C_SYNC_GITHUB,
                Option.ID_C_FAVICON_URL,
                Option.ID_C_VERSION,
                Option.ID_C_TIME_ZONE_ID,
                Option.ID_C_SIGNS,
                Option.ID_C_RELEVANT_ARTICLES_DISPLAY_CNT,
                Option.ID_C_RECENT_COMMENT_DISPLAY_CNT,
                Option.ID_C_RECENT_ARTICLE_DISPLAY_CNT,
                Option.ID_C_RANDOM_ARTICLES_DISPLAY_CNT,
                Option.ID_C_NOTICE_BOARD,
                Option.ID_C_MOST_VIEW_ARTICLE_DISPLAY_CNT,
                Option.ID_C_MOST_USED_TAG_DISPLAY_CNT,
                Option.ID_C_MOST_COMMENT_ARTICLE_DISPLAY_CNT,
                Option.ID_C_META_KEYWORDS,
                Option.ID_C_META_DESCRIPTION,
                Option.ID_C_LOCALE_STRING,
                Option.ID_C_HTML_HEAD,
                Option.ID_C_FOOTER_CONTENT,
                Option.ID_C_FEED_OUTPUT_MODE,
                Option.ID_C_FEED_OUTPUT_CNT,
                Option.ID_C_EXTERNAL_RELEVANT_ARTICLES_DISPLAY_CNT,
                Option.ID_C_ENABLE_ARTICLE_UPDATE_HINT,
                Option.ID_C_COMMENTABLE,
                Option.ID_C_BLOG_TITLE,
                Option.ID_C_BLOG_SUBTITLE,
                Option.ID_C_ARTICLE_LIST_STYLE,
                Option.ID_C_ARTICLE_LIST_PAGINATION_WINDOW_SIZE,
                Option.ID_C_ARTICLE_LIST_DISPLAY_COUNT,
                Option.ID_C_ALLOW_VISIT_DRAFT_VIA_PERMALINK,
                // Bolo 字段
                Option.ID_C_MAX_ARCHIVE,
                Option.ID_C_MAIL_BOX,
                Option.ID_C_MAIL_USERNAME,
                Option.ID_C_MAIL_PASSWORD,
                Option.ID_C_TUCHUANG_CONFIG,
                Option.ID_C_REPLY_REMIND,
                Option.ID_C_KANBANNIANG_SELECTOR,
                Option.ID_C_EDITOR_MODE,
                Option.ID_C_B3LOG_KEY,
                Option.ID_C_HACPAI_USER,
                Option.ID_C_SPAM
        );
        return optionList;
    }

    public static List<Object[]> loadOptList(JSONObject requestJSONObject) {
        List<Object[]> optList = new ArrayList<>();
        Collections.addAll(optList,
                // Solo 字段
                new Object[] { Option.ID_C_EDITOR_MODE, Option.CATEGORY_C_PREFERENCE, "sv" },
                new Object[] { Option.ID_C_HLJS_THEME, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_HLJS_THEME },
                new Object[] { Option.ID_C_SYNC_GITHUB, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_SYNC_GITHUB },
                new Object[] { Option.ID_C_PULL_GITHUB, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_PULL_GITHUB },
                new Object[] { Option.ID_C_FAVICON_URL, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_FAVICON_URL },
                new Object[] { Option.ID_C_CUSTOM_VARS, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_CUSTOM_VARS },
                new Object[] { Option.ID_C_NOTICE_BOARD, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_NOTICE_BOARD },
                new Object[] { Option.ID_C_META_DESCRIPTION, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_META_DESCRIPTION },
                new Object[] { Option.ID_C_META_KEYWORDS, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_META_KEYWORDS },
                new Object[] { Option.ID_C_HTML_HEAD, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_HTML_HEAD },
                new Object[] { Option.ID_C_RELEVANT_ARTICLES_DISPLAY_CNT, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_RELEVANT_ARTICLES_DISPLAY_COUNT },
                new Object[] { Option.ID_C_RANDOM_ARTICLES_DISPLAY_CNT, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_RANDOM_ARTICLES_DISPLAY_COUNT },
                new Object[] { Option.ID_C_EXTERNAL_RELEVANT_ARTICLES_DISPLAY_CNT, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_EXTERNAL_RELEVANT_ARTICLES_DISPLAY_COUNT },
                new Object[] { Option.ID_C_MOST_VIEW_ARTICLE_DISPLAY_CNT, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_MOST_VIEW_ARTICLES_DISPLAY_COUNT },
                new Object[] { Option.ID_C_ARTICLE_LIST_DISPLAY_COUNT, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_ARTICLE_LIST_DISPLAY_COUNT },
                new Object[] { Option.ID_C_ARTICLE_LIST_PAGINATION_WINDOW_SIZE, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_ARTICLE_LIST_PAGINATION_WINDOW_SIZE },
                new Object[] { Option.ID_C_MOST_USED_TAG_DISPLAY_CNT, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_MOST_USED_TAG_DISPLAY_COUNT },
                new Object[] { Option.ID_C_MOST_COMMENT_ARTICLE_DISPLAY_CNT, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_MOST_COMMENT_ARTICLE_DISPLAY_COUNT },
                new Object[] { Option.ID_C_RECENT_ARTICLE_DISPLAY_CNT, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_RECENT_ARTICLE_DISPLAY_COUNT },
                new Object[] { Option.ID_C_RECENT_COMMENT_DISPLAY_CNT, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_RECENT_COMMENT_DISPLAY_COUNT },
                new Object[] { Option.ID_C_BLOG_TITLE, Option.CATEGORY_C_PREFERENCE, requestJSONObject.optString(User.USER_NAME) + " 的个人博客" },
                new Object[] { Option.ID_C_BLOG_SUBTITLE, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_BLOG_SUBTITLE },
                new Object[] { Option.ID_C_LOCALE_STRING, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_LANGUAGE },
                new Object[] { Option.ID_C_ENABLE_ARTICLE_UPDATE_HINT, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_ENABLE_ARTICLE_UPDATE_HINT },
                new Object[] { Option.ID_C_SIGNS, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_SIGNS },
                new Object[] { Option.ID_C_TIME_ZONE_ID, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_TIME_ZONE },
                new Object[] { Option.ID_C_ALLOW_VISIT_DRAFT_VIA_PERMALINK, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_ALLOW_VISIT_DRAFT_VIA_PERMALINK },
                new Object[] { Option.ID_C_COMMENTABLE, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_COMMENTABLE },
                new Object[] { Option.ID_C_VERSION, Option.CATEGORY_C_PREFERENCE, SoloServletListener.VERSION},
                new Object[] { Option.ID_C_ARTICLE_LIST_STYLE, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_ARTICLE_LIST_STYLE },
                new Object[] { Option.ID_C_FEED_OUTPUT_MODE, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_FEED_OUTPUT_MODE },
                new Object[] { Option.ID_C_FEED_OUTPUT_CNT, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_FEED_OUTPUT_CNT },
                new Object[] { Option.ID_C_FOOTER_CONTENT, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_FOOTER_CONTENT },
                new Object[] { Option.ID_C_SKIN_DIR_NAME, Option.CATEGORY_C_SKIN, Option.DefaultPreference.DEFAULT_SKIN_DIR_NAME },
                new Object[] { Option.ID_C_MOBILE_SKIN_DIR_NAME, Option.CATEGORY_C_SKIN, Option.DefaultPreference.DEFAULT_MOBILE_SKIN_DIR_NAME },
                // Bolo 字段
                new Object[] { Option.ID_C_HACPAI_USER, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_HACPAI_USER },
                new Object[] { Option.ID_C_B3LOG_KEY, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_B3LOG_KEY },
                new Object[] { Option.ID_C_MAX_ARCHIVE, Option.CATEGORY_C_PREFERENCE, Option.DefaultPreference.DEFAULT_MAX_ARCHIVE },
                new Object[] { Option.ID_C_MAIL_BOX, Option.CATEGORY_C_PREFERENCE, "" },
                new Object[] { Option.ID_C_MAIL_USERNAME, Option.CATEGORY_C_PREFERENCE, "" },
                new Object[] { Option.ID_C_MAIL_PASSWORD, Option.CATEGORY_C_PREFERENCE, "" },
                new Object[] { Option.ID_C_TUCHUANG_CONFIG, Option.CATEGORY_C_PREFERENCE, "hacpai" },
                new Object[] { Option.ID_C_REPLY_REMIND, Option.CATEGORY_C_PREFERENCE, "" },
                new Object[] { Option.ID_C_KANBANNIANG_SELECTOR, Option.CATEGORY_C_PREFERENCE, "" },
                new Object[] { Option.ID_C_SPAM, Option.CATEGORY_C_PREFERENCE, "" }
                );
        return optList;
    }
}