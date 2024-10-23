package gss;

//import org.apache.olingo.commons.api.edm.EdmPrimitiveTypeKind;
//import org.apache.olingo.server.api.ODataRequest;
//import org.apache.olingo.server.api.ODataResponse;
//import org.apache.olingo.server.api.uri.UriInfo;
//import org.apache.olingo.server.api.uri.queryoption.OrderByItem;
//import org.apache.olingo.server.api.uri.queryoption.OrderByOption;
//import org.apache.olingo.server.api.uri.queryoption.OrderByOptionImpl;
//import org.apache.olingo.server.api.uri.queryoption.expression.Member;
//import org.apache.olingo.server.core.uri.queryoption.OrderByItemImpl;
//import org.apache.olingo.server.core.uri.queryoption.OrderByOptionImpl;

public class SortBy {
//    public static OrderByOption createOrderByOption(String orderByClause) {
//        // Split the order by clause into individual sorting instructions
//        String[] orderByParts = orderByClause.split(",\\s*");
//
//        // Create an OrderByOption builder
//        OrderByOptionImpl.Builder builder = new OrderByOptionImpl.Builder();
//        for (String part : orderByParts) {
//            // Split each part into the property name and the direction
//            String[] directionParts = part.trim().split("\\s+");
//            if (directionParts.length == 0) {
//                throw new IllegalArgumentException("Invalid order by clause: " + part);
//            }
//
//            String propertyName = directionParts[0];
//            boolean isDescending = directionParts.length > 1 && "desc".equalsIgnoreCase(directionParts[1]);
//
//            // Create an OrderByItem with the property name and direction
//            OrderByItem orderByItem = createOrderByItem(propertyName, isDescending);
//            builder.addOrderByItem(orderByItem);
//        }
//
//        // Build and return the OrderByOption
//        return builder.build();
//    }
//
//    private static OrderByItem createOrderByItem(String propertyName, boolean isDescending) {
//        // Create a mock Member expression for the property name
//        Member member = new MockMember(propertyName);
//
//        // Create an OrderByItem
//        OrderByItemImpl orderByItem = new OrderByItemImpl();
//        orderByItem.setExpression(member);
//        orderByItem.setDescending(isDescending);
//        return orderByItem;
//    }
//
//
//
//    public static void main(String[] args) {
//        String orderByClause = "modificationDate asc, id desc"; // Example order by clause
//        OrderByOption orderByOption = createOrderByOption(orderByClause);
//        // Print or use the orderByOption as needed
//        System.out.println("OrderByOption created: " + orderByOption);
//    }
//
//
//
//
//
//
//
//    public static OrderByOption createOrderByOption(String orderByClause) {
//
//        //TASK OE
//        //String[] split the input
//        //extract the single or if multiple values
//
//        //TASK TWO
//        //use the OrderByOption
//        OrderByOption orderByOption = new OrderByOptionImpl();
//
//        //implement it in DESCENDING ORDER and ASCENDING order as well, the condition should choose according to
//        //if the symbol plus "+" is coming at the parameter, then it's ASCENDING
//        //if the symbol minus "-" then, it's DESCENDING
//
//        return new OrderByOptionImpl();
//    }
//
//
//    public static void main(String[] args) {
//        //        String orderByClause = "modificationDate asc, id desc"; // Example order by clause
//        String order = "name(-properties.created)";
//
//        //implement as well if two orders are sent as a string
//        String order = "name(-properties.created), +id";
//        OrderByOption orderByOption = createOrderByOption(order);
//    }

}


