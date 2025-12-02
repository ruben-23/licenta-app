// import { BrowserRouter, Routes, Route } from "react-router-dom";
// import MainLayout from "./layout/MainLayout";
// import ProtectedRoute from "./components/ProtectedRoute";
//
// import Home from "./pages/Home";
// import Login from "./pages/Login";
// import Labels from "./pages/Labels";
// import NodeCounts from "./pages/NodeCounts";
// import RelationshipCounts from "./pages/RelationshipCounts";
//
// const App = () => {
//     return (
//         <BrowserRouter>
//             <Routes>
//
//                 <Route path="/login" element={<Login />} />
//
//                 <Route
//                     path="/"
//                     element={
//                         <ProtectedRoute>
//                             <MainLayout>
//                                 <Home />
//                             </MainLayout>
//                         </ProtectedRoute>
//                     }
//                 />
//
//                 <Route
//                     path="/labels"
//                     element={
//                         <ProtectedRoute>
//                             <MainLayout>
//                                 <Labels />
//                             </MainLayout>
//                         </ProtectedRoute>
//                     }
//                 />
//
//                 <Route
//                     path="/nodes"
//                     element={
//                         <ProtectedRoute>
//                             <MainLayout>
//                                 <NodeCounts />
//                             </MainLayout>
//                         </ProtectedRoute>
//                     }
//                 />
//
//                 <Route
//                     path="/relationships"
//                     element={
//                         <ProtectedRoute>
//                             <MainLayout>
//                                 <RelationshipCounts />
//                             </MainLayout>
//                         </ProtectedRoute>
//                     }
//                 />
//
//             </Routes>
//         </BrowserRouter>
//     );
// };
//
// export default App;

// App.jsx  ← correct version
import { Routes, Route } from "react-router-dom";
import MainLayout from "./layout/MainLayout";
import ProtectedRoute from "./components/ProtectedRoute";

import Home from "./pages/Home";
import Login from "./pages/Login";
import Labels from "./pages/Labels";
import NodeCounts from "./pages/NodeCounts";
import RelationshipCounts from "./pages/RelationshipCounts";

const App = () => {
    return (
        <Routes>
            <Route path="/login" element={<Login />} />
            <Route element={<MainLayout />}>
                <Route path="/" element={<Home />} />
                <Route path="/labels" element={<Labels />} />
                <Route path="/nodes" element={<NodeCounts />} />
                <Route path="/relationships" element={<RelationshipCounts />} />
            </Route>
            {/*<Route element={<ProtectedRoute />}>*/}

            {/*</Route>*/}
        </Routes>
    );
};

export default App;