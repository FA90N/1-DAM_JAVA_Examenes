package Examen;

import java.io.*;

public class ObjectOutputStreamPropia extends ObjectOutputStream {
	   public ObjectOutputStreamPropia(OutputStream out) throws IOException {
			super(out);
	   }

	   protected void writeStreamHeader() throws IOException	{
				
	   }


}
