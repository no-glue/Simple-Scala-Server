/**
 * Copyright 2011 Alberto Franco
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hube

import java.net.InetAddress

/**
 * Entry point of the application. All start from this object. 
 */
object Server {
  def main(args: Array[String]) {
    // -- Create the server, bind to localhost port 1234 -----------------------
	var server:HttpSimpleServer =
      new HttpSimpleServer(1234, InetAddress.getByName("127.0.0.1"));
  	// -- Add some handlers and start the server -------------------------------
    server.addHandler("/", new ResponseHandler("/"));
    server.addHandler("/hube", new ResponseHandler("/hube"));
    server.start;
  }
  
}