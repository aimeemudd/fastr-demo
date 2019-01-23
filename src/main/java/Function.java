import io.clc.cd.fastr.sdk.ExecutionContext;
import io.clc.cd.fastr.sdk.annotation.Context;
import io.clc.cd.fastr.sdk.annotation.Entrypoint;
import io.clc.cd.fastr.sdk.annotation.Payload;


/**
 * Created by aimeemudd on 1/23/19.
 */
public class Function {

    @Entrypoint
    public String example(@Payload String payload, @Context ExecutionContext<?> context) {

        System.out.println(context.getId() + ": " + payload);

        return payload;

    }

}