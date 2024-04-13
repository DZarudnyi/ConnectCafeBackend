import {
  BrowserRouter as Router, Route, Routes,
} from 'react-router-dom';
import App from './App';
import { HomePage } from './pages/HomePage';
import { MainPage } from './pages/MainPage';
import { CafeListPage } from './pages/CafeListPage';

export const Root = () => (
  <Router>
    <Routes>
      <Route
        path="/"
        element={(
          <App />
        )}
      >
        <Route index element={<HomePage />} />
        <Route path="main">
          <Route index element={<MainPage />} />
        </Route>
        <Route path="cafes">
          <Route index element={<CafeListPage />} />
        </Route>
      </Route>
    </Routes>
  </Router>
);
