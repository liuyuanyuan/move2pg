package lyy.pg.orcl.util;


import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * Common utils
 */
public class CommonUtils {
    
    public static <T> T notNull( T value, T defaultValue) {
        return value != null ? value : defaultValue;
    }

    public static boolean isEmpty( CharSequence value) {
        return value == null || value.length() == 0;
    }

    public static boolean isEmpty( String value) {
        return value == null || value.length() == 0;
    }

    public static boolean isNotEmpty( String value) {
        return !isEmpty(value);
    }

    public static boolean isEmpty( Collection<?> value) {
        return value == null || value.isEmpty();
    }

    public static boolean isEmpty( Map<?, ?> value) {
        return value == null || value.isEmpty();
    }

    
    public static <T> Collection<T> safeCollection( Collection<T> theList) {
        if (theList == null) {
            theList = Collections.emptyList();
        }
        return theList;
    }

    
    public static <T> List<T> safeList( List<T> theList) {
        if (theList == null) {
            theList = Collections.emptyList();
        }
        return theList;
    }

    
    public static <T> List<T> copyList( Collection<T> theList) {
        if (theList == null) {
            return new ArrayList<>();
        } else {
            return new ArrayList<>(theList);
        }
    }

    
    public static String notEmpty( String value) {
        return value == null ? "" : value;
    }

    public static boolean isTrue(Boolean value) {
        return value != null && value;
    }

    public static boolean getBoolean(String value) {
        return Boolean.parseBoolean(value);
    }

    public static boolean getBoolean( String value, boolean defaultValue) {
        return isEmpty(value) ? defaultValue : Boolean.parseBoolean(value);
    }

    public static boolean getBoolean( Object value, boolean defaultValue) {
        if (value == null) {
            return defaultValue;
        } else if (value instanceof Boolean) {
            return (Boolean) value;
        } else {
            return getBoolean(value.toString(), defaultValue);
        }
    }

    public static boolean equalObjects( Object o1,  Object o2) {
        if (o1 == o2) {
            return true;
        }
        if (o1 == null || o2 == null) {
            return false;
        }
//        if (o1.getClass() != o2.getClass()) {
//            return false;
//        }
        return o1.equals(o2);
    }

    
    public static String toString( Object object) {
        if (object == null) {
            return "";
        } else if (object instanceof String) {
            return (String) object;
        } else {
            return object.toString();
        }
    }

    public static String toString( Object object, String def) {
        if (object == null) {
            return def;
        } else if (object instanceof String) {
            return (String) object;
        } else {
            return object.toString();
        }
    }

    public static boolean toBoolean( Object object) {
        return object != null && getBoolean(object.toString());
    }

    public static int toInt( Object object, int def) {
        if (object == null) {
            return def;
        } else if (object instanceof Number) {
            return ((Number) object).intValue();
        } else {
            try {
                return Integer.parseInt(toString(object));
            } catch (NumberFormatException e) {
                return def;
            }
        }
    }

    public static int toInt( Object object) {
        return toInt(object, 0);
    }

    public static boolean isInt( Object object) {
        if (object == null) {
            return false;
        } else if (object instanceof Number) {
            return true;
        } else {
            try {
                Integer.parseInt(toString(object));
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    public static long toLong( Object object) {
        if (object == null) {
            return 0;
        } else if (object instanceof Number) {
            return ((Number) object).longValue();
        } else {
            try {
                return Long.parseLong(toString(object));
            } catch (NumberFormatException e) {
                return -1;
            }
        }
    }

    public static boolean isLong( Object object) {
        if (object == null) {
            return false;
        } else if (object instanceof Number) {
            return true;
        } else {
            try {
                Long.parseLong(toString(object));
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }
    
     
    public static List<String> splitString( String str, char delimiter) {
        if (CommonUtils.isEmpty(str)) {
            return Collections.emptyList();
        } else {
            List<String> result = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(str, String.valueOf(delimiter));
            while (st.hasMoreTokens()) {
                result.add(st.nextToken());
            }
            return result;
        }
    }

    
    public static String makeString( List<String> tokens, char delimiter) {
        if (tokens == null) {
            return "";
        } else if (tokens.size() == 1) {
            return tokens.get(0);
        } else {
            StringBuilder buf = new StringBuilder();
            for (String token : tokens) {
                if (buf.length() > 0) {
                    buf.append(delimiter);
                }
                buf.append(token);
            }
            return buf.toString();
        }
    }

    
    public static String truncateString( String str, int maxLength) {
        if (str != null && str.length() > maxLength) {
            return str.substring(0, maxLength);
        }
        return str;
    }

    public static String joinStrings(String divider, String ... array) {
        if (array == null) return "";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i > 0) str.append(divider);
            str.append(array[i]);
        }
        return str.toString();
    }

    public static String joinStrings(String divider, Collection<String> col) {
        if (col == null) return "";
        StringBuilder str = new StringBuilder();
        for (String item : col) {
            if (str.length() > 0) str.append(divider);
            str.append(item);
        }
        return str.toString();
    }

    
    public static <T extends Enum<T>> T valueOf(Class<T> type,  String name) {
        return valueOf(type, name, false);
    }

    
    public static <T extends Enum<T>> T valueOf( Class<T> type,  String name, boolean underscoreSpaces) {
        if (name == null) {
            return null;
        }
        name = name.trim();
        if (name.length() == 0) {
            return null;
        }
        if (underscoreSpaces) {
            name = name.replace(' ', '_');
        }
        try {
            return Enum.valueOf(type, name);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    
    public static <T> T getItem(Collection<T> collection, int index) {
        if (collection instanceof List) {
            return ((List<T>) collection).get(index);
        } else {
            Iterator<T> iter = collection.iterator();
            for (int i = 0; i < index; i++) {
                iter.next();
            }
            return iter.next();
        }
    }

    
    public static <T extends Enum<T>> T fromOrdinal(Class<T> enumClass, int ordinal) {
        T[] enumConstants = enumClass.getEnumConstants();
        for (T value : enumConstants) {
            if (value.ordinal() == ordinal) {
                return value;
            }
        }
        IllegalArgumentException error = new IllegalArgumentException("Invalid ordinal " + ordinal + " for type " + enumClass.getName());
        if (enumConstants.length == 0) {
            throw error;
        } else {
            error.printStackTrace(System.err);
            return enumConstants[0];
        }
    }

    
    public static <T> List<T> filterCollection(Collection<?> collection, Class<T> type) {
        List<T> result = new ArrayList<>();
        for (Object item : collection) {
            if (type.isInstance(item)) {
                result.add(type.cast(item));
            }
        }
        return result;
    }

    
    public static String escapeDisplayString(final String delim) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < delim.length(); i++) {
            char c = delim.charAt(i);
            if (c == '\n') {
                str.append("\\n");
            } else if (c == '\r') {
                str.append("\\r");
            } else if (c == '\t') {
                str.append("\\t");
            } else {
                str.append(c);
            }
        }
        return str.toString();
    }

    
    public static String unescapeDisplayString(final String delim) {
        return delim.replace("\\t", "\t").replace("\\n", "\n").replace("\\r", "\r");
    }

    public static int hashCode(  Object obj) {
        return obj == null ? 0 : obj.hashCode();
    }

    public static <T> T getOption(Map<String, ?> options, String name, T defValue) {
        Object optionValue = options.get(name);
        if (optionValue == null) {
            return defValue;
        }
        return (T)optionValue;
    }

    public static boolean getOption(Map<String, ?> options, String name) {
        return getOption(options, name, false);
    }

    public static boolean getOption(Map<String, ?> options, String name, boolean defValue) {
        if (options == null) {
            return false;
        }
        Object optionValue = options.get(name);
        if (optionValue == null) {
            return defValue;
        }
        return Boolean.TRUE.equals(optionValue);
    }

    public static String fixedLengthString(String string, int length) {
        return String.format("%1$"+length+ "s", string);
    }
    
}
